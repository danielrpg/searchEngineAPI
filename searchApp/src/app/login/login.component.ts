import { Component, OnInit, ElementRef, ViewChild } from '@angular/core';
import { Router, NavigationExtras, ActivatedRoute } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { FormBuilder, FormGroup, Validators} from '@angular/forms';
import { DataService } from '../service/data.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
  providers: [DataService]
})
export class LoginComponent implements OnInit {
  @ViewChild('username') el:ElementRef;
  statuslogin:any;
  focusin:boolean = true;
  rForm = FormGroup;
  post:any;
  usernameAlert:string="Please fill username";
  passwordAlert:string="Please fill password";
  loginAlert:string;
  loginError:boolean=false;
  return:string;
  constructor( private route:ActivatedRoute, 
               private fb: FormBuilder,
               private authenticationservice:DataService,
               public router: Router) {

    this.rForm = fb.group({
      'username' : [null, Validators.required],
      'password': [null, Validators.required]
    });              
  }

  ngOnInit() {
  }

}
