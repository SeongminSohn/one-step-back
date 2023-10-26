package com.app.onestepback.service;

import com.app.onestepback.domain.CombinedPostDTO;
import com.app.onestepback.domain.CrowdFundingDTO;
import com.app.onestepback.domain.SubscriptionDTO;

import java.util.List;
import java.util.Optional;

public interface MainService {
    public List<CombinedPostDTO> getElementsOfBanners();

    public List<CombinedPostDTO> getPostsForCards();

    public List<CrowdFundingDTO> getCrowdfundingsForCards();

}
