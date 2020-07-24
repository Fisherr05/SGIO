import { Component, OnInit } from '@angular/core';
import {DoctorService} from '../../servicios/doctor.service';

@Component({
  selector: 'app-listar-doctor',
  templateUrl: './listar-doctor.component.html',
  styleUrls: ['./listar-doctor.component.css']
})
export class ListarDoctorComponent implements OnInit {

  doctores:any=[];
  constructor(private service: DoctorService) { }

  ngOnInit(): void {
    this.listarDoctores();
  }
  listarDoctores(){
    this.service.getDoctores()
    .subscribe(
      data=>{
        console.log(data);
        this.doctores=data;
    },
      err => 
      console.log(err)
    );
  }
  borrarDoctor(id: string){
    this.service.deleteDoctor(id).subscribe(
      res =>{
        console.log(res);
        this.listarDoctores();
      },
      err => console.log(err)
    )
  }
}
