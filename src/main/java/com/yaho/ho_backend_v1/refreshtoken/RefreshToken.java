package com.yaho.ho_backend_v1.refreshtoken;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Entity
@Table(name = "refreshtoken")
@AllArgsConstructor
@NoArgsConstructor
public class RefreshToken {

    @Id
    private Long usercode;

    private String refreshtoken;
}
