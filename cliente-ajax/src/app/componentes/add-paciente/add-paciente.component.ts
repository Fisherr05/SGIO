import { Component, OnInit, HostBinding } from '@angular/core';
import { Paciente } from "src/app/modelos/Paciente";
import { PacientesService } from 'src/app/servicios/pacientes.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-paciente',
  templateUrl: './add-paciente.component.html',
  styleUrls: ['./add-paciente.component.css']
})
export class AddPacienteComponent implements OnInit {

  @HostBinding('class') classes = 'row';

  paciente: Paciente = {
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

  constructor(private pacientesService: PacientesService, private router:Router) { }

  ngOnInit(): void {
  }
 guardarPaciente(){
  delete this.paciente.idPaciente;
    this.pacientesService.savePaciente(this.paciente)
    .subscribe(
      res => {
        console.log(res);
        this.router.navigate(['/pacientes']);
      },
      err => console.error(err)
    )
  }

}
