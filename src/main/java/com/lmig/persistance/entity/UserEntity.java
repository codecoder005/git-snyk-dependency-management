package com.lmig.persistance.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
@Entity
@Table(
        name = "users"
)
public class UserEntity implements Serializable {
    @Id
    private Long uid;
    private String email;
    private String name;
}
