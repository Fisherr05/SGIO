import { Injectable } from '@angular/core';
import {HttpClient} from  '@angular/common/http';
import { Doctor } from "../modelos/Doctor";
import { Observable } from 'rxjs';
import { Router } from '@angular/router';
@Injectable({
  providedIn: 'root'
})
export class DoctorService {

  api_doctor = 'http://localhost:8080/api/sgio/doctor'

  constructor(private http: HttpClient, private router: Router) { }
  getDoctores(){
    return this.http.get(`${this.api_doctor}/`);
  }
  getDoctor(id: String){
    return this.http.get(`${this.api_doctor}/${id}`);
  }
  deleteDoctor(id: String){
    return this.http.delete(`${this.api_doctor}/${id}`);
  }
  saveDoctor(doctor: Doctor){
    return this.http.post(`${this.api_doctor}/`, doctor);
  }
  updateDoctor(updatedoctor: Doctor): Observable<Doctor>{
    return this.http.put(`${this.api_doctor}/`, updatedoctor);
  }
}
