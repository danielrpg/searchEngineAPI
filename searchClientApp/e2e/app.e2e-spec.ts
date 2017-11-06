import { SearchClientAppPage } from './app.po';

describe('search-client-app App', () => {
  let page: SearchClientAppPage;

  beforeEach(() => {
    page = new SearchClientAppPage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!');
  });
});
