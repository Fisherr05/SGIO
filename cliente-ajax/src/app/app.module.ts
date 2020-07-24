import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule} from '@angular/common/http';
import {FormsModule} from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavegacionComponent } from './componentes/navegacion/navegacion.component';
import { ListarPacienteComponent } from './componentes/listar-paciente/listar-paciente.component';
import { AddPacienteComponent } from './componentes/add-paciente/add-paciente.component';
import { EditPacienteComponent } from './componentes/edit-paciente/edit-paciente.component';
import { PacientesService } from './servicios/pacientes.service';
import { AddCitaComponent } from './componentes/add-cita/add-cita.component';
import { AddDoctorComponent } from './componentes/add-doctor/add-doctor.component';
import { EditDoctorComponent } from './componentes/edit-doctor/edit-doctor.component';
import { ListarDoctorComponent } from './componentes/listar-doctor/listar-doctor.component';
import { ListarCitaComponent } from './componentes/listar-cita/listar-cita.component';
import { EditCitaComponent } from './componentes/edit-cita/edit-cita.component';
import { DataTablesModule } from 'angular-datatables';
@NgModule({
  declarations: [
    AppComponent,
    NavegacionComponent,
    ListarPacienteComponent,
    AddPacienteComponent,
    EditPacienteComponent,
    AddCitaComponent,
    AddDoctorComponent,
    EditDoctorComponent,
    ListarDoctorComponent,
    ListarCitaComponent,
    EditCitaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    DataTablesModule
  ],
  providers: [PacientesService],
  bootstrap: [AppComponent]
})
export class AppModule { }
