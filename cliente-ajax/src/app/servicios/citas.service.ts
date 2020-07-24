import { Injectable } from '@angular/core';
import {HttpClient} from  '@angular/common/http';
import { Cita } from "../modelos/Cita";
import { Observable } from 'rxjs';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class CitasService {

  api_cita = 'http://localhost:8080/api/sgio/cita'

  constructor(private http: HttpClient, private router: Router) { }
  getCitas(){
    return this.http.get(`${this.api_cita}/`);
  }
  getCita(id: String){
    return this.http.get(`${this.api_cita}/${id}`);
  }
  deleteCita(id: String){
    return this.http.delete(`${this.api_cita}/${id}`);
  }
  saveCita(cita: Cita){
    return this.http.post(`${this.api_cita}/`, cita);
  }
  updateCita(updatedCita: Cita): Observable<Cita>{
    return this.http.put(`${this.api_cita}/`, updatedCita);
  }
}
