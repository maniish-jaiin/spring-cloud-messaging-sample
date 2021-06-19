package com.authga.springcloudaws.listener;

import com.authga.springcloudaws.model.Event;
import io.awspring.cloud.messaging.config.annotation.NotificationMessage;

public interface MessageConsumer {

    /**
     * Consumes the messages received in the queue.
     * In order to have the correct deserialization,
     * we simply need to add the annotation to extract our Event from the SNS message.
     * {@link io.awspring.cloud.messaging.config.annotation.NotificationMessage}
     *
     * @param event
     */
    public void consume(@NotificationMessage Event event);
}
