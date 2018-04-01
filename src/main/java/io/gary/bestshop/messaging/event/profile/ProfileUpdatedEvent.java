package io.gary.bestshop.messaging.event.profile;

import io.gary.bestshop.messaging.dto.ProfileDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProfileUpdatedEvent {

    ProfileDto oldProfile;

    ProfileDto updatedProfile;
}
