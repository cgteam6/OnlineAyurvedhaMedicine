package com.cg.service;

import com.cg.entities.Medicine;

public interface MedicineService {
	public Medicine addMedicine(Medicine medicine);
	public Medicine viewMedicine(Medicine medicine);
	public Medicine updateMedicine(Medicine medicine) throws MedicineNotFoundException;
	public Medicine deleteMedicine(int id) throws MedicineNotFoundException;
	public List<Medicine> showAllMedicine();

}
