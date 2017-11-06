import { EdictoAppPage } from './app.po';

describe('edicto-app App', () => {
  let page: EdictoAppPage;

  beforeEach(() => {
    page = new EdictoAppPage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!');
  });
});
