package GraphSQLStudy.service;

import GraphSQLStudy.entity.Route;
import GraphSQLStudy.entity.Vehicle;
import GraphSQLStudy.repository.RouteRepository;
import GraphSQLStudy.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements ApplicationRunner {

    private VehicleRepository userRepositoryV;
    private RouteRepository userRepositoryR;

    @Autowired
    public DataLoader(VehicleRepository userRepositoryV, RouteRepository userRepositoryR) {
        this.userRepositoryV = userRepositoryV;
        this.userRepositoryR = userRepositoryR;
    }

    public void run(ApplicationArguments args) {
        final Vehicle vehicle1 = new Vehicle();
        vehicle1.setType("car");
        vehicle1.setModelCode("Scorpio");
        vehicle1.setBrandName("Ford");
        vehicle1.setLaunchDate(LocalDate.parse("1985-01-02"));
        userRepositoryV.save(vehicle1);

        final Vehicle vehicle2 = new Vehicle();
        vehicle2.setType("car");
        vehicle2.setModelCode("Escort Mk3");
        vehicle2.setBrandName("Ford");
        vehicle2.setLaunchDate(LocalDate.parse("1980-01-04"));
        userRepositoryV.save(vehicle2);

        //routes

        final Route route1 = new Route();
        route1.setShortName("500");
        route1.setId(141500240);
        route1.setLongName("From Chicago to LA");
        route1.setRegNum("1147");
        route1.setRouteType("A");
        route1.set__typename("fuck knows");
        userRepositoryR.save(route1);

        final Route route2 = new Route();
        route2.setShortName("519");
        route2.setId(141500242);
        route2.setLongName("to the Moon and Back");
        route2.setRouteType("rocket");
        userRepositoryR.save(route2);

    }
}