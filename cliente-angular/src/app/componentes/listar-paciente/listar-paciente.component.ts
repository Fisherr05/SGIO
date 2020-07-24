import { Component, OnInit } from '@angular/core';
import {PacientesService} from '../../servicios/pacientes.service';

@Component({
  selector: 'app-listar-paciente',
  templateUrl: './listar-paciente.component.html',
  styleUrls: ['./listar-paciente.component.css']
})
export class ListarPacienteComponent implements OnInit {

  pacientes:any=[];
  constructor(private service: PacientesService) { }
  

  ngOnInit(): void {
    this.listarPacientes();
  }
  listarPacientes(){
    this.service.getPacientes()
    .subscribe(
      data=>{
        console.log(data);
        this.pacientes=data;
    },
      err => 
      console.log(err)
    );
  }
  borrarPaciente(id: string){
    this.service.deletePaciente(id).subscribe(
      res =>{
        console.log(res);
        this.listarPacientes();
      },
      err => console.log(err)
    )
  }
}
