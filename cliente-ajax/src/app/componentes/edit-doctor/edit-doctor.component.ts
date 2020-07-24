import { Component, OnInit } from '@angular/core';
import { DoctorService } from 'src/app/servicios/doctor.service';
import { Router, ActivatedRoute } from '@angular/router';
import { Doctor } from "src/app/modelos/Doctor";

@Component({
  selector: 'app-edit-doctor',
  templateUrl: './edit-doctor.component.html',
  styleUrls: ['./edit-doctor.component.css']
})
export class EditDoctorComponent implements OnInit {

  doctor: Doctor = {
    apellidosDoctor: '',
    cedDoctor: '',
    direccionDoctor: '',
    especialidadDoctor: '',
    idDoctor: 0,
    nombresDoctor: '',
    telefonoDoctor: '',
  };

  constructor(private doctorService: DoctorService, private router: Router, private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    const params = this.activatedRoute.snapshot.params;
    if(params.id){
      this.doctorService.getDoctor(params.id)
      .subscribe(
        res => {
          console.log(res);
          this.doctor = res;
        },
        err => console.error(err)
      )
    }
  }
  actualizarDoctor(){
    this.doctorService.updateDoctor(this.doctor)
    .subscribe(
      res =>{
        console.log(res);
        this.router.navigate(['/doctores']);
      },
      err => console.log(err)
    )
  }
}
