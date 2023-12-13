package com.analitrix.sellbook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.analitrix.sellbook.repository.FacturaRepository;

@Service
public class FacturaService {
	
	@Autowired
	private FacturaRepository prestamoRepository;

}
