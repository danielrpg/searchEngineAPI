import { SearchEngineAPIPage } from './app.po';

describe('search-engine-api App', () => {
  let page: SearchEngineAPIPage;

  beforeEach(() => {
    page = new SearchEngineAPIPage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!');
  });
});
