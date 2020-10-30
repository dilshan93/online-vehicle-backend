//package com.sale.online.vehicle.service.impl;
//
//import com.sale.online.vehicle.entity.Districts;
//import com.sale.online.vehicle.repository.DistricsRepository;
//import com.sale.online.vehicle.service.LocationService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import javax.transaction.Transactional;
//import java.util.List;
//
//@Transactional
//@Service
//public class LocationServiceImpl implements LocationService {
//
//    @Autowired
//    private DistricsRepository districsRepository;
//
//    @Override
//    public List<Districts> getAllDistricts() {
//        List<Districts> districts = districsRepository.findAll();
//        return districts;
//    }
//}
