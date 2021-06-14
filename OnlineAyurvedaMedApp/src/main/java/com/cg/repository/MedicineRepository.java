package com.cg.repository;

public interface MedicineRepository {
	public Medicine addMedicine(Medicine medicine);
	public Medicine viewMedicine(Medicine medicine);
	public Medicine updateMedicine(Medicine medicine) throws MedicineNotFoundException;
	public Medicine deleteMedicine(int id) throws MedicineNotFoundException;
	public List<Medicine> showAllMedicine();

}
