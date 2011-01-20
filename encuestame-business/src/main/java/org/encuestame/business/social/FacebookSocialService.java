/*
 ************************************************************************************
 * Copyright (C) 2001-2010 encuestame: system online surveys Copyright (C) 2009
 * encuestame Development Team.
 * Licensed under the Apache Software License version 2.0
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to  in writing,  software  distributed
 * under the License is distributed  on  an  "AS IS"  BASIS,  WITHOUT  WARRANTIES  OR
 * CONDITIONS OF ANY KIND, either  express  or  implied.  See  the  License  for  the
 * specific language governing permissions and limitations under the License.
 ************************************************************************************
 */
package org.encuestame.business.social;

import org.encuestame.persistence.domain.security.SocialAccountProvider;
import org.encuestame.utils.oauth.OAuthToken;
import org.springframework.social.facebook.FacebookOperations;
import org.springframework.social.facebook.FacebookTemplate;
import org.springframework.social.twitter.TwitterOperations;
import org.springframework.social.twitter.TwitterTemplate;

/**
 * Facebook. Social Service.
 * @author Picado, Juan juanATencuestame.org
 * @since Dec 25, 2010 5:57:35 PM
 * @version $Id:$
 */
public class FacebookSocialService extends AbstractSocialProvider<FacebookOperations> implements IFacebookSocialService{


    /**
     * Social Account Provider;
     */
    private SocialAccountProvider parameters;

    /**
     * Twitter Template.
     */
    private FacebookTemplate facebookTemplate;

    /**
     *
     * @param socialProviderName
     */
    public FacebookSocialService() {
        this.loadParameters();
    }

    /**
     * Load Parameters.
     */
    private void loadParameters(){
        if(getSocialProviderDao() != null){
            final SocialAccountProvider parameters = getSocialProviderDao().getSocialAccountProviderId(4L);
            if(parameters == null){
                log.error("NOT SOCIAL PROVIDER FOUND");
            }
            setParameters(parameters);
        } else {
            log.error("No Provider Dao");
        }
    }

    @Override
    protected FacebookOperations createServiceOperations(OAuthToken accessToken) {
        if (accessToken == null) {
            throw new IllegalStateException("Cannot access Facebook without an access token");
        }
        return new FacebookTemplate(accessToken.getValue());
    }

    @Override
    protected String fetchProviderAccountId(FacebookOperations serviceOperations) {
      return serviceOperations.getProfileId();
    }

    @Override
    protected String buildProviderProfileUrl(String providerAccountId,
            FacebookOperations serviceOperations) {
        return "http://www.facebook.com/profile.php?id=" + providerAccountId;
    }

    @Override
    SocialAccountProvider getParameters() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    SocialAccountProvider setParameters(SocialAccountProvider accountProvider) {
        // TODO Auto-generated method stub
        return null;
    }

    public String fetchProviderAccountId(TwitterOperations serviceOperations) {
        // TODO Auto-generated method stub
        return null;
    }
}
