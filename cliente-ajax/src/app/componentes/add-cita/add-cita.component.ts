import { Component, OnInit, HostBinding } from '@angular/core';
import { Cita } from "src/app/modelos/Cita";
import { CitasService } from 'src/app/servicios/citas.service';
import { PacientesService} from 'src/app/servicios/pacientes.service';
import { DoctorService } from 'src/app/servicios/doctor.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-cita',
  templateUrl: './add-cita.component.html',
  styleUrls: ['./add-cita.component.css']
})
export class AddCitaComponent implements OnInit {

  @HostBinding('class') classes = 'row';

  cita: Cita={
    idCita: 0,
    idPaciente: 0,
    idDoctor: 0,
    fechaCita: '',
    horaCita: '',
  };

  pacientes:any=[];

  doctores: any=[];

  constructor(private doctorService:DoctorService, private pacientesService: PacientesService, private citasService: CitasService, private router:Router) { }

  ngOnInit(): void {
    this.listarPacientes();
    this.listarDoctores();
  }
  listarPacientes(){
    this.pacientesService.getPacientes()
    .subscribe(
      data=>{
        console.log(data);
        this.pacientes=data;
    },
      err => 
      console.log(err)
    );
  }
  listarDoctores(){
    this.doctorService.getDoctores()
    .subscribe(
      data=>{
        console.log(data);
        this.doctores=data;
    },
      err => 
      console.log(err)
    );
  }
  guardarCita(){
    delete this.cita.idCita;
      this.citasService.saveCita(this.cita)
      .subscribe(
        res => {
          console.log(res);
          this.router.navigate(['/citas']);
        },
        err => console.error(err)
      )
    }

}
