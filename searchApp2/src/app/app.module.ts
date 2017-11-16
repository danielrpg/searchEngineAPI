import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import {routing, appRoutingProviders } from './app.routing';

import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { NavbarComponent } from './home/navbar/navbar.component';
import { TextsearchComponent } from './home/textsearch/textsearch.component';
import { TableresultComponent } from './home/tableresult/tableresult.component';
import { AdvancedsearchComponent } from './home/advancedsearch/advancedsearch.component';
import { AdvancedformComponent } from './home/advancedsearch/advancedform/advancedform.component';
import { DetailedictComponent } from './home/detailedict/detailedict.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HomeComponent,
    NavbarComponent,
    TextsearchComponent,
    TableresultComponent,
    AdvancedsearchComponent,
    AdvancedformComponent,
    DetailedictComponent
  ],
  imports: [
    BrowserModule,
    HttpModule,
    FormsModule,
    routing
  ],
  providers: [
    appRoutingProviders
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
