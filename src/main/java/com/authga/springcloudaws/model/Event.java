package com.authga.springcloudaws.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Event implements Comparable<Event> {
    private String eventId;
    private String version;
    private String occurredAt;
    private EventData data;

    @Override
    public int compareTo(Event o) {
        int otherVersion = Integer.parseInt(o.getVersion());
        int thisVersion = Integer.parseInt(this.getVersion());
        return Integer.compare(thisVersion, otherVersion);
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventId='" + eventId + '\'' +
                ", version='" + version + '\'' +
                ", occurredAt='" + occurredAt + '\'' +
                ", data=" + data +
                '}';
    }
}
