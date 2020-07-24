import { Component, OnInit,HostBinding} from '@angular/core';
import { Cita } from "src/app/modelos/Cita";
import { CitasService } from 'src/app/servicios/citas.service';
import { PacientesService} from 'src/app/servicios/pacientes.service';
import { DoctorService } from 'src/app/servicios/doctor.service';
import { Router, ActivatedRoute } from '@angular/router';
@Component({
  selector: 'app-edit-cita',
  templateUrl: './edit-cita.component.html',
  styleUrls: ['./edit-cita.component.css']
})
export class EditCitaComponent implements OnInit {

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

  constructor(private doctorService:DoctorService, private pacientesService: PacientesService, private citasService: CitasService, private router:Router, private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    this.listarPacientes();
    this.listarDoctores();
    const params = this.activatedRoute.snapshot.params;
    if(params.id){
      this.citasService.getCita(params.id)
      .subscribe(
        res => {
          console.log(res);
          this.cita = res;
        },
        err => console.error(err)
      )
    }
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
  actualizarCita(){
    this.citasService.updateCita(this.cita)
    .subscribe(
      res =>{
        console.log(res);
        this.router.navigate(['/citas']);
      },
      err => console.log(err)
    )
  }

}
