import { Healthcheck } from './healthcheck';

describe('Healthcheck', () => {
  it('should create an instance', () => {
    expect(new Healthcheck(1,'1','OK')).toBeTruthy();
  });
});
