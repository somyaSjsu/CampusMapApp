package com.anshumantripathi.campusmapapp.model;

import java.util.ArrayList;
public class CampusData {

    private static Coordiantes point1;
    private static Coordiantes point2;
    private static Coordiantes point3;
    private static Coordiantes point4;
    public static ArrayList<BuildingData> buildingData;

    public ArrayList<BuildingData> getBuildingData() {
        return buildingData;
    }

    public void setBuildingData(ArrayList<BuildingData> userBuildingData) {
        buildingData = userBuildingData;
    }

    public Coordiantes getPoint1() {
        return point1;
    }

    public void setPoint1(Coordiantes userPoint1) {
        point1 = userPoint1;
    }

    public Coordiantes getPoint2() {
        return point2;
    }

    public void setPoint2(Coordiantes userPoint2) {
        point2 = userPoint2;
    }

    public Coordiantes getPoint3() {
        return point3;
    }

    public void setPoint3(Coordiantes userPoint3) {
        point3 = userPoint3;
    }

    public Coordiantes getPoint4() {
        return point4;
    }

    public void setPoint4(Coordiantes userPoint4) {
        point4 = userPoint4;
    }

    public static void initCampusBoundaries() {

        //4th and San Fernando
        point1 = new Coordiantes();
        point1.setLat(37.335848);
        point1.setLng(-121.886039);

        //10th and San Fernando
        point2 = new Coordiantes();
        point2.setLat(37.338893);
        point2.setLng(-121.879698);

        //10th and E. San Salvador
        point3 = new Coordiantes();
        point3.setLat(37.334557);
        point3.setLng(-121.876453);

        //4th and E. San Salvador
        point4 =  new Coordiantes();
        point4.setLat(37.331550);
        point4.setLng(-121.882851);

    }
    
}
