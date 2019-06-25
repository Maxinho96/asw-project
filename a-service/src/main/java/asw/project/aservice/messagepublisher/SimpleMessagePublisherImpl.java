package asw.project.aservice.messagepublisher;

import asw.project.aservice.domain.SimpleMessagePublisher;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.kafka.core.KafkaTemplate;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component 
public class SimpleMessagePublisherImpl implements SimpleMessagePublisher {

	@Value("${asw.kafka.channel.out}")
	private String channel;

    @Autowired
    private KafkaTemplate<String, String> template;

    @Override
    public void publish(String message) {
        template.send(channel, message);
    }

}
