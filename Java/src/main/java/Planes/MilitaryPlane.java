package Planes;

import Types.MilitaryType;

import java.util.Objects;

public class MilitaryPlane extends Plane{

    private MilitaryType militaryType;

    public MilitaryPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, MilitaryType militaryType) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.militaryType = militaryType;
    }

    public MilitaryType getMilitaryType() {
        return militaryType;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", military type=" + militaryType +
                '}');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MilitaryPlane) || !super.equals(o)) return false;
        MilitaryPlane thatMilitaryType = (MilitaryPlane) o;
        return militaryType == thatMilitaryType.militaryType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), militaryType);
    }
}
