package com.example.restservice.services;

import com.example.restservice.models.Route;
import com.example.restservice.repositories.RoutesRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class RouteService {
    @Autowired
    RoutesRepo routeRepo;

    public List<Route> getAllRoutes() {
        return routeRepo.findAll();
    }

    public void save(Route route) {
        routeRepo.save(route);
    }

    public Route getRoute(Integer id) {routeRepo.findById(id).get();
        return null;
    }

    public void delete(Integer id) {routeRepo.deleteById(id);
    }
}
