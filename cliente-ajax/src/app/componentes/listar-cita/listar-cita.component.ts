import { Component, OnInit } from '@angular/core';
import {CitasService} from '../../servicios/citas.service';

@Component({
  selector: 'app-listar-cita',
  templateUrl: './listar-cita.component.html',
  styleUrls: ['./listar-cita.component.css']
})
export class ListarCitaComponent implements OnInit {


  citas:any=[];
  constructor(private service: CitasService) { }

  ngOnInit(): void {
    this.listarCitas();
  }
  listarCitas(){
    this.service.getCitas()
    .subscribe(
      data=>{
        console.log(data);
        this.citas=data;
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
