package com.sherlock.spring.data.jpa.tutorial.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.util.Locale;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@AttributeOverrides({
        @AttributeOverride(
                name = "guardianName",
                column = @Column(name = "guardian_name")
        ),
        @AttributeOverride(
                name = "guardianEmail",
                column = @Column(name = "guardian_email")
        ),
        @AttributeOverride(
                name = "guardianMobile",
                column = @Column(name = "guardian_mobile")
        )
})
@Builder
public class Guardian {

    private String guardianName;
    private String guardianEmail;
    private String guardianMobile;
}
