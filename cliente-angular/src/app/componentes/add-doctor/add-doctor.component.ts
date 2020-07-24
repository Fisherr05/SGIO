import { Component, OnInit, HostBinding } from '@angular/core';
import { Doctor} from "src/app/modelos/Doctor";
import { DoctorService } from 'src/app/servicios/doctor.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-doctor',
  templateUrl: './add-doctor.component.html',
  styleUrls: ['./add-doctor.component.css']
})
export class AddDoctorComponent implements OnInit {

  @HostBinding('class') classes = 'row';

  doctor: Doctor = {
    apellidosDoctor: '',
    cedDoctor: '',
    direccionDoctor: '',
    especialidadDoctor: '',
    idDoctor: 0,
    nombresDoctor: '',
    telefonoDoctor: '',
  };

  constructor(private doctorService: DoctorService, private router:Router) { }

  ngOnInit(): void {
  }
  guardarDoctor(){
    this.doctorService.saveDoctor(this.doctor)
    .subscribe(
      res => {
        console.log(res);
        this.router.navigate(['/doctores']);
      },
      err => console.error(err)
    )
  }
}
