import java.util.ArrayList;
import java.util.List;

class rutasipt {
    private final String routeNumber;
    private final List<String> stops;

    public rutasipt(String routeNumber) {
        this.routeNumber = routeNumber;
        this.stops = new ArrayList<>();
    }

    public String getRouteNumber() {
        return routeNumber;
    }

    public void addStop(String stop) {
        stops.add(stop);
    }

    public List<String> getStops() {
        return stops;
    }
}
