package com.dh.dentalClinicMVC.service.impl;

import com.dh.dentalClinicMVC.entity.Dentist;
import com.dh.dentalClinicMVC.repository.IDentistRepository;
import com.dh.dentalClinicMVC.service.IDentistService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DentistServiceImpl implements IDentistService {

    private IDentistRepository dentistRepository;

    public DentistServiceImpl(IDentistRepository dentistRepository) {
        this.dentistRepository = dentistRepository;
    }

    @Override
    public Dentist save(Dentist dentist) {
        return dentistRepository.save(dentist);
    }

    @Override
    public Optional<Dentist> findById(Long id) {
        return dentistRepository.findById(id);
    }

    @Override
    public void update(Dentist dentist) {
        dentistRepository.save(dentist);
    }

    @Override
    public void delete(Long id) {
        dentistRepository.deleteById(id);
    }

    @Override
    public List<Dentist> findAll() {
        return dentistRepository.findAll();
    }
}
