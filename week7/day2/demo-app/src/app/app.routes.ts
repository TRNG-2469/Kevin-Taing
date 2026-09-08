import { Routes } from '@angular/router';
import { Welcome } from './welcome/welcome.component';
import { Onewaydb } from './onewaydb/onewaydb.component';
import { Twowaydb } from './twowaydb/twowaydb.component';
import { PipeDemo } from './pipe-demo/pipe-demo.component';
import { authGuard } from './auth.guard';

export const routes: Routes = [
    {
        path: '',
        component: Welcome,
    },
    {
        path: 'one-way',
        component: Onewaydb,
    },
    {
        path: 'two-way',
        component: Twowaydb,
    },
    {
        // path: 'pipes/:id',
        path: 'pipes',
        component: PipeDemo,
        canActivate: [authGuard]
    }
];
