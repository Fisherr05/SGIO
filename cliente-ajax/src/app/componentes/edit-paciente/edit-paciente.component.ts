import { Component, OnInit } from '@angular/core';
import { PacientesService } from 'src/app/servicios/pacientes.service';
import { Router, ActivatedRoute } from '@angular/router';
import { Paciente } from "src/app/modelos/Paciente";

@Component({
  selector: 'app-edit-paciente',
  templateUrl: './edit-paciente.component.html',
  styleUrls: ['./edit-paciente.component.css']
})
export class EditPacienteComponent implements OnInit {
  paciente: Paciente= {
    idPaciente: 0,
    cedPaciente: '',
    nombresPaciente: '',
    apellidosPaciente: '',
    direccionPaciente: '',
    emailPaciente: '',
    telefonoPaciente: '',
    alergiasPaciente: '',
    edadPaciente: null,
    observacionesPaciente: '',
  };

  constructor(private pacientesService: PacientesService, private router: Router, private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    const params = this.activatedRoute.snapshot.params;
    if(params.id){
      this.pacientesService.getPaciente(params.id)
      .subscribe(
        res => {
          console.log(res);
          this.paciente = res;
        },
        err => console.error(err)
      )
    }
  
  }
  actualizarPaciente(){
    this.pacientesService.updatePaciente(this.paciente)
    .subscribe(
      res => {
        console.log(res);
        this.router.navigate(['/pacientes']);
      },
      err => console.log(err)
    )
  }


}
