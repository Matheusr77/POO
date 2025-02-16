public class Localizacao {
    private int idAnimal;
    private double latitude;
    private double longitude;

    public Localizacao(int idAnimal, double latitude, double longitude) {
        this.idAnimal = idAnimal;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    @Override
    public String toString() {
        return "Animal ID: " + idAnimal + ", Latitude: " + latitude + ", Longitude: " + longitude;
    }
}
