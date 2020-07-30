import { Component, OnInit,OnDestroy} from '@angular/core';
import {PacientesService} from '../../servicios/pacientes.service';
import { Subject } from 'rxjs';

@Component({
  selector: 'app-listar-paciente',
  templateUrl: './listar-paciente.component.html',
  styleUrls: ['./listar-paciente.component.css']
})
export class ListarPacienteComponent implements OnDestroy, OnInit {
  dtOptions: DataTables.Settings = {};
  dtTrigger = new Subject()

  pacientes:any=[];
  constructor(private service: PacientesService) { }
  

  ngOnInit(): void {
    this.dtOptions = {
      pagingType: 'full_numbers',
      pageLength: 10,
      language: {
        url: '//cdn.datatables.net/plug-ins/1.10.21/i18n/Spanish.json'
      }
   };
    this.listarPacientes();
  }
  ngOnDestroy(){
    this.dtTrigger.unsubscribe();
  }	  

  listarPacientes(){
    this.service.getPacientes()
    .subscribe(
      data=>{
        console.log(data);
        this.pacientes=data;
        this.dtTrigger.next();
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
