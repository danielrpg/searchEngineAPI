import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute, Params } from '@angular/router';
import { User } from '../models/User';
import { LoginService } from '../services/login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
  providers: [LoginService]
})
export class LoginComponent implements OnInit {
  public user:User;
  public response:Response;

  constructor( private loginService:LoginService,
               private route:ActivatedRoute,
               private router:Router) { 
    this.user = new User("", "");
  }

  ngOnInit() {
    console.log(this.loginService.getMessage());
  }

  onSubmit (){
    this.loginService.loginUser(this.user)
                     .then(response =>{
                       console.log(response);
                       if(response){
                         this.router.navigate(['/home']);
                       }else{
                        
                       }
                     });
                     
                     
  }
}
