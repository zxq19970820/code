package com.spring.entity;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component   //相当于<bean  id  class></bean> new ClassRom()
public class ClassRoom {
    @Value("实训123")
    private String roomName;  //教室名字
    @Value("30")
    private int size;       //教室容量

    public ClassRoom() {
    }

    public ClassRoom(String roomName, int size) {
        this.roomName = roomName;
        this.size = size;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "roomName='" + roomName + '\'' +
                ", size=" + size +
                '}';
    }
}
