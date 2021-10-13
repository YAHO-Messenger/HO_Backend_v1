package com.yaho.ho_backend_v1.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name= " user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "user_idx")
    private Long userIdx;

    @Column(name = "id")
    private String id;

    @Column(name = "pw")
    private String pw;

    @Column(name = "name")
    private String name;



}
