import { ComponentFixture, TestBed } from '@angular/core/testing';
import { Twowaydb } from './twowaydb.component';

describe('Twowaydb', () => {
  let component: Twowaydb;
  let fixture: ComponentFixture<Twowaydb>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Twowaydb],
    }).compileComponents();

    fixture = TestBed.createComponent(Twowaydb);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
