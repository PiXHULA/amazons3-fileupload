package com.joakimonnhage.awsimageupload.datastore;

import com.joakimonnhage.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("c793645d-45c2-4ac1-9ba1-588a79f6e0c8"),"MrLogan",null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("256477d7-d684-4418-96b5-eaeb9410ca71"),"MrsJones",null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("a4164721-2591-4184-b371-c7debcd571f0"),"SrSeverad",null));
    }

    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }
}
