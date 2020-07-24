import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ListarPacienteComponent } from './componentes/listar-paciente/listar-paciente.component';
import { AddPacienteComponent } from './componentes/add-paciente/add-paciente.component';
import { EditPacienteComponent } from './componentes/edit-paciente/edit-paciente.component';
import { ListarDoctorComponent } from './componentes/listar-doctor/listar-doctor.component';
import { AddDoctorComponent } from './componentes/add-doctor/add-doctor.component';
import { EditDoctorComponent } from './componentes/edit-doctor/edit-doctor.component';
import { ListarCitaComponent } from './componentes/listar-cita/listar-cita.component';
import { AddCitaComponent } from './componentes/add-cita/add-cita.component';
import { EditCitaComponent } from './componentes/edit-cita/edit-cita.component';

const routes: Routes = [
  {path:"pacientes", component:ListarPacienteComponent},
  {path:"pacientes/add", component:AddPacienteComponent},
  {path:"pacientes/edit/:id", component:EditPacienteComponent},
  {path:"doctores", component:ListarDoctorComponent},
  {path:"doctores/add", component:AddDoctorComponent},
  {path:"doctores/edit/:id", component:EditDoctorComponent},
  {path:"citas", component:ListarCitaComponent},
  {path:"citas/add", component:AddCitaComponent},
  {path:"citas/edit/:id", component:EditCitaComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
