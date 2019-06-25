package asw.project.bservice.messagelistener;

import asw.project.bservice.domain.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.apache.kafka.clients.consumer.ConsumerRecord;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component 
public class BMessageListener {

	@Value("${asw.kafka.channel.in}")
	private String channel;

	@Value("${asw.kafka.groupid}")
	private String groupId;

    @Autowired
    private BService simpleConsumerService;

	@KafkaListener(topics = "${asw.kafka.channel.in}", groupId="${asw.kafka.groupid}")
    public void listen(ConsumerRecord<String, String> record) throws Exception {
        String message = record.value();
		simpleConsumerService.onMessage(message); 
    }

}
