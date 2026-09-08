import { CanActivateFn } from '@angular/router';

export const authGuard: CanActivateFn = (route, state) => {
  const isLoggedIn = false;
  if(isLoggedIn) {
    return true;
  }
  return false;
};
