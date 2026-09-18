package org.com.lab.dto.response;

import lombok.Builder;

@Builder
public record StatsResponse(
        Long totalDomains,
        Long totalChannels,
        Long totalRecords) {
}
