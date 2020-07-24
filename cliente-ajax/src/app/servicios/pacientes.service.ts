import { Injectable } from '@angular/core';
import {HttpClient} from  '@angular/common/http';
import { Paciente } from "../modelos/Paciente";
import { Observable } from 'rxjs';
import { Router } from '@angular/router';
@Injectable({
  providedIn: 'root'
})
export class PacientesService {
  
  api_paciente = 'http://localhost:8080/api/sgio/paciente'


  constructor(private http: HttpClient, private router:Router) { }
  getPacientes(){
    return this.http.get(`${this.api_paciente}/`);
  }
  getPaciente(id: String){
    return this.http.get(`${this.api_paciente}/${id}`);
  }
  deletePaciente(id: String){
    return this.http.delete(`${this.api_paciente}/${id}`);
  }
  savePaciente(paciente: Paciente){
    return this.http.post(`${this.api_paciente}/`, paciente);
  }
  updatePaciente(updatedPaciente: Paciente): Observable<Paciente>{
    return this.http.put(`${this.api_paciente}/`, updatedPaciente);
  }
}
