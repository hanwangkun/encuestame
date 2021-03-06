/*
 ************************************************************************************
 * Copyright (C) 2001-2011 encuestame: system online surveys Copyright (C) 2011
 * encuestame Development Team.
 * Licensed under the Apache Software License version 2.0
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to  in writing,  software  distributed
 * under the License is distributed  on  an  "AS IS"  BASIS,  WITHOUT  WARRANTIES  OR
 * CONDITIONS OF ANY KIND, either  express  or  implied.  See  the  License  for  the
 * specific language governing permissions and limitations under the License.
 ************************************************************************************
 */
package org.encuestame.social.api.operation;

import java.util.List;

import org.encuestame.social.api.FacebookLink;
import org.encuestame.social.api.profile.FacebookProfile;
import org.encuestame.utils.TweetPublishedMetadata;
import org.springframework.util.MultiValueMap;

/**
 * Facebook API operations.
 * @author Picado, Juan juanATencuestame.org
 * @since Apr 22, 2011
 */
public interface FacebookAPIOperations extends SocialAPIOperations{

    /**
     *
     * @param object
     * @param connection
     * @param data
     * @return
     */
    TweetPublishedMetadata publish(String object, String connection, MultiValueMap<String, String> data);

    /**
     *
     * @param message
     * @param link
     */
    void updateStatus(String message, FacebookLink link);

    /**
     *
     * @return
     */
    List<String> getFriendIds();

    /**
     *
     * @param facebookId
     * @return
     */
    FacebookProfile getUserProfile(String facebookId);

    /**
     *
     * @return
     */
    FacebookProfile getUserProfile();
}
