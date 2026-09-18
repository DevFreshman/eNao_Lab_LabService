package org.com.lab.services;

import org.com.lab.dto.response.StatsResponse;
import org.com.lab.repository.ChannelJpaRepository;
import org.com.lab.repository.CrawledRecordJpaRepository;
import org.com.lab.repository.DomainJpaRepository;
import org.springframework.stereotype.Service;

@Service
public class StatsServices {

    private final DomainJpaRepository domainJpaRepository;
    private final ChannelJpaRepository channelJpaRepository;
    private final CrawledRecordJpaRepository crawledRecordJpaRepository;

    public StatsServices(DomainJpaRepository domainJpaRepository, ChannelJpaRepository channelJpaRepository, CrawledRecordJpaRepository crawledRecordJpaRepository) {
        this.domainJpaRepository = domainJpaRepository;
        this.channelJpaRepository = channelJpaRepository;
        this.crawledRecordJpaRepository = crawledRecordJpaRepository;
    }

    public StatsResponse getStats() {
        return StatsResponse.builder()
                .totalDomains(domainJpaRepository.count())
                .totalChannels(channelJpaRepository.count())
                .totalRecords(crawledRecordJpaRepository.count())
                .build();
    }
}
