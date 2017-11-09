import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { AppComponent } from './app.component';
import { LogincomponentComponent } from './logincomponent/logincomponent.component';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { ListitemComponent } from './listitem/listitem.component';

@NgModule({
  declarations: [
    AppComponent,
    LogincomponentComponent,
    LoginComponent,
    HomeComponent,
    ListitemComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
