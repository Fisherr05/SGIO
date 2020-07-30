import { Component, OnInit, OnDestroy } from '@angular/core';
import {CitasService} from '../../servicios/citas.service';
import { Subject } from 'rxjs';

@Component({
  selector: 'app-listar-cita',
  templateUrl: './listar-cita.component.html',
  styleUrls: ['./listar-cita.component.css']
})
export class ListarCitaComponent implements OnDestroy, OnInit {

  dtOptions: DataTables.Settings = {};
  dtTrigger = new Subject();

  citas:any=[];
  constructor(private service: CitasService) { }

  ngOnInit(): void {
    

    this.dtOptions = {
      pagingType: 'full_numbers',
      pageLength: 10,
      language: {
        url: '//cdn.datatables.net/plug-ins/1.10.21/i18n/Spanish.json'
      }
    };
    this.listarCitas();

  }
  ngOnDestroy(){
    this.dtTrigger.unsubscribe();
  }
  listarCitas(){
    this.service.getCitas()
    .subscribe(
      data=>{
        console.log(data);
        this.citas=data;
        this.dtTrigger.next();
    },
      err => 
      console.log(err)
    );
  }
  borrarCita(id: string){
    this.service.deleteCita(id).subscribe(
      res =>{
        console.log(res);
        this.listarCitas();
      },
      err => console.log(err)
    )
  }

}
