package com.rafael.meetingroom.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="meetingRoom")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="name",nullable = false)
    private String name;

    @Column(name="date", nullable = false)
    private String date;

    @Column(name="startHour",nullable = false)
    private String startHour;

    @Column(name="endHour",nullable = false)
    private String endHour;

    @Override
    public String toString(){
        return "Room [id = "+id+", name = "+name+", startHour = "+startHour+", endHour = "+endHour+"]";
    }

}
